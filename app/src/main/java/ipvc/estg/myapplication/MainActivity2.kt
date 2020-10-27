package ipvc.estg.myapplication;


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ipvc.estg.myapplication.adapter.LineAdapter
import ipvc.estg.myapplication.dataclasses.Aluno
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var myList: ArrayList<Aluno>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        myList = ArrayList<Aluno>()

        for (i in 0 until 500) {
            myList.add(Aluno("Nome $i", i*500, "Escola $i"))
        }

        recycler_view.adapter = LineAdapter(myList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        //recycler_view.setHasFixedSize(true)
    }


    fun insert(view: View) {
        myList.add(0, Aluno("Nome XXX", 22247, "Escola XXX"))
        recycler_view.adapter?.notifyDataSetChanged()

    }
}
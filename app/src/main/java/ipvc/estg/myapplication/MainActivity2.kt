package ipvc.estg.myapplication;


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import ipvc.estg.myapplication.adapter.LineAdapter
import ipvc.estg.myapplication.dataclasses.Estudante
import kotlinx.android.synthetic.main.activity_main2.*


class MainActivity2 : AppCompatActivity() {

    private lateinit var List: ArrayList<Estudante>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        List = ArrayList<Estudante>()

        for (i in 0 until 500) {
            List.add(Estudante("Nome $i", i*500, "Escola $i"))
        }

        recycler_view.adapter = LineAdapter(List)
        recycler_view.layoutManager = LinearLayoutManager(this)
        //recycler_view.setHasFixedSize(true)
    }

    fun insert(view: View) {
        List.add(0, Estudante("Nome XXX", 22247, "Escola XXX"))
        recycler_view.adapter?.notifyDataSetChanged()

    }
}
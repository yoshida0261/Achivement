package stcompany.com.achivement.fragment

import android.content.Context
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import stcompany.com.achivement.R
import java.util.*

/**
 * A placeholder fragment containing a simple view.
 */
class MainActivityFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_main, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?){
        //super(savedInstanceState)

        var list = ArrayList<String>()
        for(a in 1..5){
            list.add(a.toString())
        }

        /*
        var listView = findViewById(R.id.ListView) as ListView
        var adapter = ArrayAdapter<String>(activity, android.R.layout.simple_list_item_1, list)
        listView.adapter = adapter
        listView?.setOnItemClickListener({
            parent, view, position, id->
            parent.getItemAtPosition(position)
            Toast.makeText(activity, position.toString(), Toast.LENGTH_SHORT).show()
        })*/

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)

    }
}

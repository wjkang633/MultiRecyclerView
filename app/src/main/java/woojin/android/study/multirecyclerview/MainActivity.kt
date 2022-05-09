package woojin.android.study.multirecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import woojin.android.study.multirecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = mutableListOf<ListData>().apply {
            add(ListData(1))
            add(ListData(1))
            add(ListData(1))
            add(ListData(1))
            add(ListData(1))
            add(ListData(1))
            add(ListData(1))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(2))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
            add(ListData(3))
        }

        val adapter = MultiListAdapter(dataList)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
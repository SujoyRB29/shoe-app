package bd.sujoy.amad.shoesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bd.sujoy.amad.shoesapp.databinding.ShoeItemBinding
import bd.sujoy.amad.shoesapp.model.Shoes
import java.util.ArrayList

class ShoesAdapter (private val shoeslist:ArrayList<Shoes>):RecyclerView.Adapter<ShoesAdapter.MyViewholder>(){
    class MyViewholder(val binding: ShoeItemBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
      val view = ShoeItemBinding.inflate(
          LayoutInflater.from(parent.context),
          parent,
           : false

      )
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        TODO("Not yet implemented")
    }
}
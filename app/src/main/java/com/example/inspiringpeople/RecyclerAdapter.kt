package com.example.inspiringpeople

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_list.view.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlin.random.Random

class RecyclerAdapter(private val context: Context, private val peopleRepository: PeopleRepository): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = peopleRepository.getPeopleInstance().size

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val people = peopleRepository.getPeopleInstance()
        Glide.with(holder.itemView.person_image).load(people[position].getImageUrl()).apply(RequestOptions()
            .override(holder.itemView.person_image.width, holder.itemView.person_image.height)).into(holder.itemView.person_image)
        holder.itemView.person_name.text = people[position].getName()
        holder.itemView.person_birth.text = people[position].getBirth()
        holder.itemView.person_description.text = people[position].getDescription()

        holder.itemView.card.setOnClickListener()
        {
            Toast.makeText(context, people[position].getQuotes()[Random.nextInt(people[position].getQuotes().size)], Toast.LENGTH_LONG).show()
        }

    }
}


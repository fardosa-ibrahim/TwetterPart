package com.example.twiterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwetterAdaptor(var tweeter:List<Tweets>):
    RecyclerView.Adapter<TweeterViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweeterViewHolder {
        var itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item,parent,false)
        return  TweeterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TweeterViewHolder, position: Int) {
        var currentContact=tweeter.get(position)
        holder.tvName.text=currentContact.name
        holder.tvHundle.text=currentContact.hundle
        holder.tvHour.text=currentContact.hour
        holder.tvTweet.text=currentContact.tweet

    }

    override fun getItemCount(): Int {
        return tweeter.size

    }


}
    class TweeterViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        var tvName=itemView.findViewById<TextView>(R.id.tvName)
        var tvHundle=itemView.findViewById<TextView>(R.id.tvHundle)
        var tvHour=itemView.findViewById<TextView>(R.id.tvNumber)
        var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
        var imgProfile=itemView.findViewById<ImageView>(R.id.imgProfile)
        var imgshare=itemView.findViewById<ImageView>(R.id.imgShare)
        var imgchatst=itemView.findViewById<ImageView>(R.id.imgChats)
        var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
        var imgComment=itemView.findViewById<ImageView>(R.id.imgComment)

    }
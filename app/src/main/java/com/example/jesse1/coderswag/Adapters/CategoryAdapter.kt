package com.example.jesse1.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.jesse1.coderswag.Model.Category
import com.example.jesse1.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder

        //if the view is null, inflate it, create a holder, set the Ui views
        if (convertView == null) {
            //takes an xml layout and turns it into a view we can use in code
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

            holder = ViewHolder()

            //grab category image and name holder allows us to recycle these views so we don't have to regenerate a view everytime
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else { //recycle the view and put it in the holder
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        //convert image names to resource IDs
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        holder.categoryName?.text = category.title

        return categoryView
    }
    //method to retrieve the item in the position that the list view is on
    override fun getItem(position: Int): Any {
        return categories[position]
    }
    //defines a unique ID for each row
    override fun getItemId(position: Int): Long {
        return 0
    }
    //return number of categories in the array (number of views to display)
    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}
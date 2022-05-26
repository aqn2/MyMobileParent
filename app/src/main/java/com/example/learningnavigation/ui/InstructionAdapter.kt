package com.example.learningnavigation.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.learningnavigation.R

class InstructionAdapter (var dataSet: List<Instructions>) :
    RecyclerView.Adapter<InstructionAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val textViewName : TextView
    //    val textViewDesc : TextView
        val layout : ConstraintLayout

        init {
            textViewName = view.findViewById(R.id.textView_instructions_name)
         //   textViewDesc = view.findViewById(R.id.textView_instructionsDetail_description)
            layout = view.findViewById(R.id.layout_instructionsItem)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.fragment_instructions_item, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        val instruction = dataSet[position]
        viewHolder.textViewName.text = dataSet[position].name
//        viewHolder.textViewDesc.text = dataSet[position].instruction
        viewHolder.layout.setOnClickListener {
            //Toast.makeText(it.context, "Hi, you clicked on ${hero.name}", Toast.LENGTH_SHORT).show()
            val context = viewHolder.layout.context
            val instructionDetailIntent = Intent(context, InstructionDetail::class.java).apply {
                putExtra(InstructionDetail.EXTRA_INSTRUCTION, instruction)
            }
            context.startActivity(instructionDetailIntent)
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}
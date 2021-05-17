package exercise.android.reemh.todo_items;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    final int DONE = 1;
    final int INPROGRESS=2;
    public TodoItemsHolder holder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (holder == null) {
            holder = new TodoItemsHolderImpl();
        }

        // TODO: implement the specs as defined below
        //    (find all UI components, hook them up, connect everything you need)
        holder.addNewInProgressItem("task 1");
        holder.addNewInProgressItem("task 2");
//        holder.addNewInProgressItem("task 3");
        ToDoItemAdapter adapter = new ToDoItemAdapter((TodoItemsHolderImpl)holder);
        adapter.setToDoItems(holder.getCurrentItems());
        RecyclerView recyclerTodoItemsList = findViewById(R.id.recyclerTodoItemsList);
        recyclerTodoItemsList.setAdapter(adapter);
        recyclerTodoItemsList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        EditText taskText = findViewById(R.id.editTextInsertTask);
        FloatingActionButton addButton = findViewById(R.id.buttonCreateTodoItem);

        addButton.setOnClickListener(v->{
            if (!taskText.getText().toString().equals(""))
            {
                // add a new task
                holder.addNewInProgressItem(taskText.getText().toString());
                adapter.setToDoItems(holder.getCurrentItems());
                taskText.setText("");
            }
        });

    }

}

/*

SPECS:

- the screen starts out empty (no items shown, edit-text input should be empty)
- every time the user taps the "add TODO item" button:
    * if the edit-text is empty (no input), nothing happens
    * if there is input:
        - a new TodoItem (checkbox not checked) will be created and added to the items list
        - the new TodoItem will be shown as the first item in the Recycler view
        - the edit-text input will be erased
- the "TodoItems" list is shown in the screen
  * every operation that creates/edits/deletes a TodoItem should immediately be shown in the UI
  * the order of the TodoItems in the UI is:
    - all IN-PROGRESS items are shown first. items are sorted by creation time,
      where the last-created item is the first item in the list
    - all DONE items are shown afterwards, no particular sort is needed (but try to think about what's the best UX for the user)
  * every item shows a checkbox and a description. you can decide to show other data as well (creation time, etc)
  * DONE items should show the checkbox as checked, and the description with a strike-through text
  * IN-PROGRESS items should show the checkbox as not checked, and the description text normal
  * upon click on the checkbox, flip the TodoItem's state (if was DONE will be IN-PROGRESS, and vice versa)
  * add a functionality to remove a TodoItem. either by a button, long-click or any other UX as you want
- when a screen rotation happens (user flips the screen):
  * the UI should still show the same list of TodoItems
  * the edit-text should store the same user-input (don't erase input upon screen change)

Remarks:
- you should use the `holder` field of the activity
- you will need to create a class extending from RecyclerView.Adapter and use it in this activity
- notice that you have the "row_todo_item.xml" file and you can use it in the adapter
- you should add tests to make sure your activity works as expected. take a look at file `MainActivityTest.java`



(optional, for advanced students:
- save the TodoItems list to file, so the list will still be in the same state even when app is killed and re-launched
)

*/
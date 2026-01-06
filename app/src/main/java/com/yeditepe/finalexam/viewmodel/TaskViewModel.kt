package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task
import kotlin.text.get
import kotlin.text.set

class TaskViewModel : ViewModel() {

    private val _tasks = mutableStateListOf<Task>()
    val tasks: List<Task> get() = _tasks

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks

    init {
        _tasks.add(Task(1, "sınava çalış", false))
        _tasks.add(Task(2, "projeyi teslim et", true))
    }


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task

        val index = _tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = _tasks[index]
            _tasks[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}

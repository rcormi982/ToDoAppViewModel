package com.turing.alan.cpifp.ui

import android.os.Message
import androidx.lifecycle.ViewModel
import com.turing.alan.cpifp.data.Task
import com.turing.alan.cpifp.data.TaskRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class TaskUiState(
    val id: String,
    val tittle: String ="",
    val body: String ="",
    val completed: Boolean = false
)


sealed class TaskListUiState{
    data object Loading: TaskListUiState()
    abstract class Success(task:List<TaskUiState>):TaskListUiState()//Es variable
    abstract class Error(message: String): TaskListUiState()
    //He definido tres estados diferentes

}

@HiltViewModel//Los hilt viewModel hay que inyectarlos
class TaskListViewModel @Inject constructor(private val repository: TaskRepository):ViewModel() {//Consume del repositorio
    //Está mal, se hace de otra manera
    private var _uiState: TaskListUiState = TaskListUiState.Loading
    val uiState:TaskListUiState
        get() = _uiState


}
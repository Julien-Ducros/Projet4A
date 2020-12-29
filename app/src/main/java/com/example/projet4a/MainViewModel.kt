package com.example.projet4a


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projet4a.domaine.CreateUserUseCase
import com.example.projet4a.domaine.GetUserUseCase
import com.example.projet4a.domaine.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class MainViewModel(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
)  : ViewModel(){

    val text: MutableLiveData<String> = MutableLiveData()

    init {
        text.value = "Pokédex"

    }
    fun onClickedIncrement(emailUser: String) {
        viewModelScope.launch(Dispatchers.IO) {
            createUserUseCase.invoke(User("test"))
           val user = getUserUseCase.invoke("test")

        }

        //counter.value = (counter.value ?: 0) +1
    }
    }









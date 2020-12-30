package com.example.projet4a


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.projet4a.domaine.CreateUserUseCase
import com.example.projet4a.domaine.GetUserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainViewModel(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
)  : ViewModel(){


    val loginLiveData: MutableLiveData<LoginStatus> = MutableLiveData()

    fun onClickedLogin(emailUser: String, passwordUser: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val user = getUserUseCase.invoke(emailUser, passwordUser)
           val loginStatus = if (user != null && passwordUser != null) {
                    LoginSuccess(user.email, passwordUser.password )
            } else {
                LoginError
            }
            withContext(Dispatchers.Main){
            loginLiveData.value=loginStatus }
        }


    }
    }

//createUserUseCase.invoke(User("test"))
// val user = getUserUseCase.invoke("test")

//counter.value = (counter.value ?: 0) +1





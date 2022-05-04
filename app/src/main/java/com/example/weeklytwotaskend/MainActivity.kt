package com.example.weeklytwotaskend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //OnCreate используется для вызова setContentView
        //Запуск второго потока для получения данных
    }
    override fun onResume() {
        super.onResume()
        Log.d("MyLog","onResume MainActivity")
        //onResume используется для регистрации ресиверов
        //Перезапуск анимаций
    }
    override fun onPause() {
        super.onPause()
        Log.d("MyLog","onPause MainActivity")
        //onPause используется для остановки ресивера
        //остановки анимации
        //сохранения данных экрана
    }
    override fun onStart() {
        super.onStart()
        Log.d("MyLog","onStart MainActivity")
        //onStart используется для запуска второго потока получения данных
        //повторная инициализация
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog","onStop MainActivity")
        //onStop используется для остановки ресивера
        //остановки соединия с сервером
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog","onDestroy MainActivity")
        //onDestroy используется для закрытия соединения с базой данных
        //остановки второстепенных потоков
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog","onRestart MainActivity")
        //onRestart используется для соединения с сервером
        //пересоздания экрана
    }

    // 2.10
    //Жизненный цикл необходим для реализации всей логики приложения в определенный момент, дабы получать и сохранять данные без утерь.
    //Для логики перехода между активити, сворачивания и т.д.

    // 2.11
    //1. Вконтакте при выходе из диалога в onPause сохраняется уже введенное, но не отправленное сообщение.
    //2. Во всех приложениях при запуске, в onCreate/onStart, мы получаем все данные либо инициализируем обсервер.
    //3. Вконтакте, при работающей музыке, в onPause проверяется есть ли подписка на ВК music и в соответствии с этим, либо отключает музыку, либо оставляет в фоне

}
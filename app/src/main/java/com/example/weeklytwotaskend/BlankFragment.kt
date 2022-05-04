package com.example.weeklytwotaskend

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
        //Вызывается для создания компонентов внутри фрагмента
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("MyLog", "onAttach fragment")
        //Вызывается, когда фрагмент связывается с активностью
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog", "onStart fragment")
        //Вызывается, когда фрагмент видим для пользователя
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog", "onResume fragment")
        //Аналогично активити
    }

    override fun onStop() {
        Log.d("MyLog", "onStop fragment")
        super.onStop()
        //Аналогично активити
    }

    override fun onDestroyView() {
        Log.d("MyLog", "onDestroyView fragment")
        super.onDestroyView()
        //Уничтожается представление фрагмента
    }

    override fun onDestroy() {
        Log.d("MyLog", "onDestroy fragment")
        super.onDestroy()
        //окончательное уничтожение фрагмента
    }

    override fun onDetach() {
        Log.d("MyLog", "onDetach fragment")
        super.onDetach()
        //Фрагмент удаляется из FragmentManager и открепляется от класса Activity
    }
}
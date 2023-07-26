package com.example.quiz

object Constants {

    const val  USER_NAME  = "user_name"
    const val  TOTAL_QUESTION  = "total_question"
    const val  CORRECT_ANSWER  = "correct_answer"


    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_argentina,"Argentina","India",
            "USA","Russia",1
        )
        questionList.add(que1)
        val que2 = Question(
            2,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_australia,"Argentina","India",
            "Australia","Russia",3
        )
        questionList.add(que2)

        val que3 = Question(
            3,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_belgium,"Belgium","India",
            "USA","Russia",1
        )
        questionList.add(que3)

        val que4 = Question(
            4,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_brazil,"Argentina","Brazil",
            "USA","Russia",2
        )
        questionList.add(que4)

        val que5 = Question(
            5,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_denmark,"Denmark","China",
            "USA","Sri Lanka",1
        )
        questionList.add(que5)

        val que6 = Question(
            6,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_fiji,"Brazil","India",
            "England","Fiji",4
        )
        questionList.add(que6)

        val que7 = Question(
            7,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_germany,"Germany","Nazi",
            "Poland","India",1
        )
        questionList.add(que7)

        val que8 = Question(
            8,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_india,"Argentina","India",
            "USA","Russia",2
        )
        questionList.add(que8)

        val que9 = Question(
            9,"What Country does this flag belong too?",
            R.drawable.ic_flag_of_kuwait,"Canada","India",
            "Kuwait","China",3
        )
        questionList.add(que9)

        return questionList

    }

}
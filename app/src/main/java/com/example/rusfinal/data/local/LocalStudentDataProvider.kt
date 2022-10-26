package com.example.rusfinal.data.local

import com.example.rusfinal.data.Student

object LocalStudentDataProvider {
    val defaultStudent = Student(-1, "")

    val allStudent = listOf(
        Student(
            id = 63410040,
            fullName = "WATTANACHAI MANEEKHAM"
        ),
        Student(
            id = 63410043,
            fullName = "CHETHAMAS PHAICHAN"
        ),
        Student(
            id = 63410075,
            fullName = "KASIPAT JANSOON"
        ),
        Student(
            id = 63410077,
            fullName = "SUTANAI WANMAHACHAI"
        ),
        Student(
            id = 63410154,
            fullName = "PUNYARIT KLAPHACHON"
        ),
        Student(
            id = 63410156,
            fullName = "RATCHAPHUMPHOUG PHONTHAI"
        ),
    )
}
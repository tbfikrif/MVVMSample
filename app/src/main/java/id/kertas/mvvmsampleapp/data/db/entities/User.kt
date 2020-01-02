package id.kertas.mvvmsampleapp.data.db.entities

import androidx.room.Entity

const val CURRENT_USER_ID = 0

@Entity
data class User (
    var id: Int? = null,
    var name: String? = null,
    var email: String? = null,
    var password: String? = null,
    var email_verified_at: String? = null,
    var created_at: String? = null,
    var updated_at: String? = null
)
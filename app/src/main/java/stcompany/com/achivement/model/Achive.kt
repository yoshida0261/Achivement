package stcompany.com.achivement.model

import com.github.gfx.android.orma.annotation.Column
import com.github.gfx.android.orma.annotation.PrimaryKey
import com.github.gfx.android.orma.annotation.Table

import java.sql.Date

/**
 * Created by takeshi on 16/05/11.
 */
@Table
class Achive {

    @PrimaryKey(autoincrement = true)
    var id: Long = 0

    @Column
    var date: Date? = null

    @Column(indexed = true)
    var title: String? = null

    @Column
    var count: Int = 0

    @Column
    var content: String? = null

    @Column(indexed = true)
    var done: Boolean = false
}

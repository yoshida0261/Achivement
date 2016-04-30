package stcompany.com.achivement

/**
 * Created by takeshi on 16/05/01.
 */
import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

@Table
class AchiveData{
    @PrimaryKey
    var id: Long = 0

    @Column(indexed = true)
    var title : String = ""

    @Column
    var content: String=""

    @Column
    var createdTimeMillis: Long=0
}
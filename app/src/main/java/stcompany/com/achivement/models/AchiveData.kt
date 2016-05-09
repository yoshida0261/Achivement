package stcompany.com.achivement.models

/**
 * Created by takeshi on 16/05/01.
 */
import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;


@Table
class AchiveData{
    @PrimaryKey(autoincrement = true) var id: Long = 0

    @Column var name: String = ""
    /*
    @PrimaryKey
    public var id: Long = 0


    @Nullable
    @Column(indexed = true)
    public var title : String = ""

    @Setter
    public fun AchiveData(){}

    @Setter
    public fun AchiveData(id: Long, title: String)
    {


       this.id = id
        this.title = title
    }
*/


}
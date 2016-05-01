package stcompany.com.achivement

/**
 * Created by takeshi on 16/05/01.
 */
import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

import android.support.annotation.Nullable;
import com.github.gfx.android.orma.annotation.Setter

@Table
class AchiveData{
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



}
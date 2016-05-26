package stcompany.com.achivement.model;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

/**
 * Created by takeshi on 16/05/27.
 */
@Table
public class AchiveModel {
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column(indexed = true)
    public String title;

}

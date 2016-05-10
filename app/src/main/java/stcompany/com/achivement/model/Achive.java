package stcompany.com.achivement.model;

import android.support.annotation.Nullable;

import com.github.gfx.android.orma.annotation.Column;
import com.github.gfx.android.orma.annotation.PrimaryKey;
import com.github.gfx.android.orma.annotation.Table;

import java.sql.Date;

/**
 * Created by takeshi on 16/05/11.
 */
@Table
public class Achive {

    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public Date date;

    @Column(indexed = true)
    public String title;

    @Column
    public int count;

    @Column
    @Nullable // allows NULL (default: NOT NULL)
    public String content;

    @Column(indexed = true)
    public boolean done;
}

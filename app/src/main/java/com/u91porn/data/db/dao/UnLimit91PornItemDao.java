package com.u91porn.data.db.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.SqlUtils;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.u91porn.data.model.VideoResult;

import com.u91porn.data.model.UnLimit91PornItem;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "UN_LIMIT91_PORN_ITEM".
*/
public class UnLimit91PornItemDao extends AbstractDao<UnLimit91PornItem, Long> {

    public static final String TABLENAME = "UN_LIMIT91_PORN_ITEM";

    /**
     * Properties of entity UnLimit91PornItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ViewKey = new Property(1, String.class, "viewKey", false, "VIEW_KEY");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property ImgUrl = new Property(3, String.class, "imgUrl", false, "IMG_URL");
        public final static Property Duration = new Property(4, String.class, "duration", false, "DURATION");
        public final static Property Info = new Property(5, String.class, "info", false, "INFO");
        public final static Property VideoResultId = new Property(6, long.class, "videoResultId", false, "VIDEO_RESULT_ID");
        public final static Property DownloadId = new Property(7, int.class, "downloadId", false, "DOWNLOAD_ID");
        public final static Property Progress = new Property(8, int.class, "progress", false, "PROGRESS");
        public final static Property Speed = new Property(9, long.class, "speed", false, "SPEED");
        public final static Property SoFarBytes = new Property(10, int.class, "soFarBytes", false, "SO_FAR_BYTES");
        public final static Property TotalFarBytes = new Property(11, int.class, "totalFarBytes", false, "TOTAL_FAR_BYTES");
        public final static Property Status = new Property(12, int.class, "status", false, "STATUS");
        public final static Property AddDownloadDate = new Property(13, java.util.Date.class, "addDownloadDate", false, "ADD_DOWNLOAD_DATE");
        public final static Property FinishedDownloadDate = new Property(14, java.util.Date.class, "finishedDownloadDate", false, "FINISHED_DOWNLOAD_DATE");
        public final static Property ViewHistoryDate = new Property(15, java.util.Date.class, "viewHistoryDate", false, "VIEW_HISTORY_DATE");
    }

    private DaoSession daoSession;


    public UnLimit91PornItemDao(DaoConfig config) {
        super(config);
    }
    
    public UnLimit91PornItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"UN_LIMIT91_PORN_ITEM\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"VIEW_KEY\" TEXT," + // 1: viewKey
                "\"TITLE\" TEXT," + // 2: title
                "\"IMG_URL\" TEXT," + // 3: imgUrl
                "\"DURATION\" TEXT," + // 4: duration
                "\"INFO\" TEXT," + // 5: info
                "\"VIDEO_RESULT_ID\" INTEGER NOT NULL ," + // 6: videoResultId
                "\"DOWNLOAD_ID\" INTEGER NOT NULL ," + // 7: downloadId
                "\"PROGRESS\" INTEGER NOT NULL ," + // 8: progress
                "\"SPEED\" INTEGER NOT NULL ," + // 9: speed
                "\"SO_FAR_BYTES\" INTEGER NOT NULL ," + // 10: soFarBytes
                "\"TOTAL_FAR_BYTES\" INTEGER NOT NULL ," + // 11: totalFarBytes
                "\"STATUS\" INTEGER NOT NULL ," + // 12: status
                "\"ADD_DOWNLOAD_DATE\" INTEGER," + // 13: addDownloadDate
                "\"FINISHED_DOWNLOAD_DATE\" INTEGER," + // 14: finishedDownloadDate
                "\"VIEW_HISTORY_DATE\" INTEGER);"); // 15: viewHistoryDate
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_UN_LIMIT91_PORN_ITEM_VIEW_KEY ON \"UN_LIMIT91_PORN_ITEM\"" +
                " (\"VIEW_KEY\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"UN_LIMIT91_PORN_ITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, UnLimit91PornItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String viewKey = entity.getViewKey();
        if (viewKey != null) {
            stmt.bindString(2, viewKey);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String duration = entity.getDuration();
        if (duration != null) {
            stmt.bindString(5, duration);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(6, info);
        }
        stmt.bindLong(7, entity.getVideoResultId());
        stmt.bindLong(8, entity.getDownloadId());
        stmt.bindLong(9, entity.getProgress());
        stmt.bindLong(10, entity.getSpeed());
        stmt.bindLong(11, entity.getSoFarBytes());
        stmt.bindLong(12, entity.getTotalFarBytes());
        stmt.bindLong(13, entity.getStatus());
 
        java.util.Date addDownloadDate = entity.getAddDownloadDate();
        if (addDownloadDate != null) {
            stmt.bindLong(14, addDownloadDate.getTime());
        }
 
        java.util.Date finishedDownloadDate = entity.getFinishedDownloadDate();
        if (finishedDownloadDate != null) {
            stmt.bindLong(15, finishedDownloadDate.getTime());
        }
 
        java.util.Date viewHistoryDate = entity.getViewHistoryDate();
        if (viewHistoryDate != null) {
            stmt.bindLong(16, viewHistoryDate.getTime());
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, UnLimit91PornItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String viewKey = entity.getViewKey();
        if (viewKey != null) {
            stmt.bindString(2, viewKey);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String imgUrl = entity.getImgUrl();
        if (imgUrl != null) {
            stmt.bindString(4, imgUrl);
        }
 
        String duration = entity.getDuration();
        if (duration != null) {
            stmt.bindString(5, duration);
        }
 
        String info = entity.getInfo();
        if (info != null) {
            stmt.bindString(6, info);
        }
        stmt.bindLong(7, entity.getVideoResultId());
        stmt.bindLong(8, entity.getDownloadId());
        stmt.bindLong(9, entity.getProgress());
        stmt.bindLong(10, entity.getSpeed());
        stmt.bindLong(11, entity.getSoFarBytes());
        stmt.bindLong(12, entity.getTotalFarBytes());
        stmt.bindLong(13, entity.getStatus());
 
        java.util.Date addDownloadDate = entity.getAddDownloadDate();
        if (addDownloadDate != null) {
            stmt.bindLong(14, addDownloadDate.getTime());
        }
 
        java.util.Date finishedDownloadDate = entity.getFinishedDownloadDate();
        if (finishedDownloadDate != null) {
            stmt.bindLong(15, finishedDownloadDate.getTime());
        }
 
        java.util.Date viewHistoryDate = entity.getViewHistoryDate();
        if (viewHistoryDate != null) {
            stmt.bindLong(16, viewHistoryDate.getTime());
        }
    }

    @Override
    protected final void attachEntity(UnLimit91PornItem entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public UnLimit91PornItem readEntity(Cursor cursor, int offset) {
        UnLimit91PornItem entity = new UnLimit91PornItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // viewKey
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // imgUrl
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // duration
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // info
            cursor.getLong(offset + 6), // videoResultId
            cursor.getInt(offset + 7), // downloadId
            cursor.getInt(offset + 8), // progress
            cursor.getLong(offset + 9), // speed
            cursor.getInt(offset + 10), // soFarBytes
            cursor.getInt(offset + 11), // totalFarBytes
            cursor.getInt(offset + 12), // status
            cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)), // addDownloadDate
            cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)), // finishedDownloadDate
            cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)) // viewHistoryDate
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, UnLimit91PornItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setViewKey(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setImgUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDuration(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setInfo(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setVideoResultId(cursor.getLong(offset + 6));
        entity.setDownloadId(cursor.getInt(offset + 7));
        entity.setProgress(cursor.getInt(offset + 8));
        entity.setSpeed(cursor.getLong(offset + 9));
        entity.setSoFarBytes(cursor.getInt(offset + 10));
        entity.setTotalFarBytes(cursor.getInt(offset + 11));
        entity.setStatus(cursor.getInt(offset + 12));
        entity.setAddDownloadDate(cursor.isNull(offset + 13) ? null : new java.util.Date(cursor.getLong(offset + 13)));
        entity.setFinishedDownloadDate(cursor.isNull(offset + 14) ? null : new java.util.Date(cursor.getLong(offset + 14)));
        entity.setViewHistoryDate(cursor.isNull(offset + 15) ? null : new java.util.Date(cursor.getLong(offset + 15)));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(UnLimit91PornItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(UnLimit91PornItem entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(UnLimit91PornItem entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getVideoResultDao().getAllColumns());
            builder.append(" FROM UN_LIMIT91_PORN_ITEM T");
            builder.append(" LEFT JOIN VIDEO_RESULT T0 ON T.\"VIDEO_RESULT_ID\"=T0.\"_id\"");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected UnLimit91PornItem loadCurrentDeep(Cursor cursor, boolean lock) {
        UnLimit91PornItem entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        VideoResult videoResult = loadCurrentOther(daoSession.getVideoResultDao(), cursor, offset);
         if(videoResult != null) {
            entity.setVideoResult(videoResult);
        }

        return entity;    
    }

    public UnLimit91PornItem loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<UnLimit91PornItem> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<UnLimit91PornItem> list = new ArrayList<UnLimit91PornItem>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<UnLimit91PornItem> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<UnLimit91PornItem> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}

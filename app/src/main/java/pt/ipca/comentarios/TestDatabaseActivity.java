package pt.ipca.comentarios;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class TestDatabaseActivity extends Activity {
    private CommentsDataSource mDatasource;
    private ListView mListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDatasource = new CommentsDataSource(this);
        mDatasource.open();

        CommentsCursorAdapter adapter = new CommentsCursorAdapter(this, mDatasource.getAllComments());
        mListView.setAdapter(adapter);
    }
}
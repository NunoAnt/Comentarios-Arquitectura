package pt.ipca.comentarios;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class CommentsCursorAdapter extends CursorAdapter {
    public CommentsCursorAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false);
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView tvComment = (TextView) view.findViewById(R.id.tvBody);
        Comment comment = CommentsDataSource.cursorToComment(cursor);

        tvComment.setText(comment.toString());
    }
}
package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.collegespotter.R;

import model.College;

import java.util.List;

public class CollegeAdapter extends RecyclerView.Adapter<CollegeAdapter.CollegeAdapterViewHolder>{
    Context mContext;
    List<College> collegeList;

    public CollegeAdapter(Context mContext, List<College> collegeList) {
        this.mContext = mContext;
        this.collegeList = collegeList;
    }

    @NonNull
    @Override
    public CollegeAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.collegelist,viewGroup,false);
        return new CollegeAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CollegeAdapterViewHolder collegeAdapterViewHolder, int i) {
        College college = collegeList.get(i);
        collegeAdapterViewHolder.tvCollegeName.setText(college.getCollegeName());
        collegeAdapterViewHolder.tvLocation.setText(college.getCollegeLocation());
        collegeAdapterViewHolder.tvCourse.setText(college.getCollegeCource());
        collegeAdapterViewHolder.tvPrice.setText(Integer.toString(college.getCollegePrice()));
        collegeAdapterViewHolder.collegeImage.setImageResource(college.getImageID());
    }

    @Override
    public int getItemCount() {
        return collegeList.size();
    }

    public class CollegeAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView tvCollegeName, tvLocation, tvPrice, tvCourse;
        ImageView collegeImage;


        public CollegeAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCollegeName = itemView.findViewById(R.id.tvCollegeName);
            tvLocation = itemView.findViewById(R.id.tvLocation);
            tvCourse = itemView.findViewById(R.id.tvCourse);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            collegeImage = itemView.findViewById(R.id.collegeImage);

        }
    }
}

package org.ramizael.jwmeetingsassignments.fragments;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import org.ramizael.jwmeetingsassignments.R;
import org.ramizael.jwmeetingsassignments.activities.PersonDetailActivity;
import org.ramizael.jwmeetingsassignments.activities.PersonListActivity;
import org.ramizael.jwmeetingsassignments.entities.Person;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A fragment representing a single Person detail screen.
 * This fragment is either contained in a {@link PersonListActivity}
 * in two-pane mode (on tablets) or a {@link PersonDetailActivity}
 * on handsets.
 */
public class PersonDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Person mItem;
    @BindView(R.id.person_detail_name) TextView name;
    @BindView(R.id.person_detail_age) TextView age;
    @BindView(R.id.person_detail_status) CheckBox status;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public PersonDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = Person.findById(Person.class, Long.valueOf(getArguments().getString(ARG_ITEM_ID)));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.getName());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.person_detail, container, false);

        ButterKnife.bind(this, rootView);
        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.person_detail_name)).setText(mItem.getName());
            ((TextView) rootView.findViewById(R.id.person_detail_age)).setText(mItem.getAge().toString());
            ((CheckBox) rootView.findViewById(R.id.person_detail_status)).setChecked(mItem.getStatus());
        }

        return rootView;
    }
}

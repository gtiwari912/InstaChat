package com.gaurav.whatsappclone.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gaurav.whatsappclone.Fragments.CallsFragment;
import com.gaurav.whatsappclone.Fragments.ChatsFragment;
import com.gaurav.whatsappclone.Fragments.StatusFragment;

public class FragmentAdapter extends FragmentPagerAdapter{
    public FragmentAdapter(@NonNull  FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new ChatsFragment();
            case 1: return new StatusFragment();
            case 2: return new CallsFragment();
            default: return new ChatsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position==0){
            title = "Chats";
        }else if (position == 1){
            title = "Status";
        }else if (position == 2){
            title = "Calls";
        }else {
            title = "Chats";
        }
        return title;
    }
}

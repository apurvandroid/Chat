package com.dreams.chat_apurv.interfaces;

import android.view.View;

import com.dreams.chat_apurv.models.Group;
import com.dreams.chat_apurv.models.User;


public interface OnUserGroupItemClick {
    void OnUserClick(User user, int position, View userImage);
    void OnGroupClick(Group group, int position, View userImage);
}

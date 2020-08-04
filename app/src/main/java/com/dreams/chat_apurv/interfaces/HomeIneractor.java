package com.dreams.chat_apurv.interfaces;

import com.dreams.chat_apurv.models.Contact;
import com.dreams.chat_apurv.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    User getUserMe();

    ArrayList<Contact> getLocalContacts();

}

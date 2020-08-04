package com.dreams.chat_apurv.viewHolders;

import android.view.View;

import com.dreams.chat_apurv.models.AttachmentTypes;

public class MessageTypingViewHolder extends BaseMessageViewHolder {
    public MessageTypingViewHolder(View itemView) {
        super(itemView, AttachmentTypes.NONE_TYPING,null);
    }
}

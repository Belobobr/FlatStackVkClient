package com.flatstack.vkclient.content;

import android.content.Context;

public interface IContentChangeObserver {

    void register(final Context context);

    void unregister(final Context context);

}

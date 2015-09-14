package com.flatstack.vkclient.content.loader;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.Nullable;

import com.flatstack.vkclient.content.ContentProviderChangeObserver;
import com.flatstack.vkclient.content.IContentChangeObserver;


public abstract class AbstractContentProviderLoader<E> extends AbstractLoader<E> {

    private final Uri mUri;

    public AbstractContentProviderLoader(final Context context, final Uri uri) {
        super(context);
        mUri = uri;
    }

    @Nullable
    @Override
    public IContentChangeObserver onCreateContentObserver() {
        return new ContentProviderChangeObserver(this, mUri);
    }

}
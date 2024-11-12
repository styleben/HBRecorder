package com.hbisoft.hbrecorder;

import android.media.projection.MediaProjection;
import android.os.Parcel;
import android.os.Parcelable;

public class MediaProjectionWrapper implements Parcelable {
    private transient MediaProjection mediaProjection;

    public MediaProjectionWrapper(MediaProjection mediaProjection) {
        this.mediaProjection = mediaProjection;
    }

    public MediaProjection getMediaProjection() {
        return mediaProjection;
    }

    protected MediaProjectionWrapper(Parcel in) {
        // Cannot actually parcel MediaProjection
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // Cannot actually parcel MediaProjection
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MediaProjectionWrapper> CREATOR = new Creator<MediaProjectionWrapper>() {
        @Override
        public MediaProjectionWrapper createFromParcel(Parcel in) {
            return new MediaProjectionWrapper(in);
        }

        @Override
        public MediaProjectionWrapper[] newArray(int size) {
            return new MediaProjectionWrapper[size];
        }
    };
}
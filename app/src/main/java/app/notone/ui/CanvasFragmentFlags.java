package app.notone.ui;

import android.net.Uri;

import app.notone.ui.fragments.CanvasFragment;


/**
 * All the flags that are currently set in the {@link CanvasFragment}.
 * Some of the flags are used to determine if the CanvasFragment should
 * load the last opened canvas when it starts or if it should wait
 * because an async task is still running in the background that
 * is opening another canvas or loading a pdf.
 *
 * @author Kai Titgens
 * @author kai.titgens@stud.th-owl.de
 * @version 0.1
 * @since 0.1
 */
public class CanvasFragmentFlags {
    /**
     * uri of the current canvas
     */
    private Uri mUri;
    /**
     * True if a pdf import is currently running
     */
    private boolean mLoadPdf;
    /**
     * True if the textmarker is currently active
     */
    private boolean mMarkerEnabled;
    /**
     * True if a new file is currently being created
     */
    private boolean mNewFile;
    /**
     * True if a file is currently being opened
     */
    private boolean mOpenFile;

    public CanvasFragmentFlags() {
        this.mUri = null;
        this.mLoadPdf = false;
        this.mMarkerEnabled = false;
        this.mNewFile = false;
        this.mOpenFile = false;
    }

    public CanvasFragmentFlags(Uri uri, boolean loadPdf,
                               boolean markerEnabled, boolean newFile,
                               boolean openFile) {
        this.mUri = uri;
        this.mLoadPdf = loadPdf;
        this.mMarkerEnabled = markerEnabled;
        this.mNewFile = newFile;
        this.mOpenFile = openFile;
    }

    public Uri getUri() {
        return mUri;
    }

    public void setUri(Uri mUri) {
        this.mUri = mUri;
    }

    public boolean isLoadingPdf() {
        return mLoadPdf;
    }

    public void setLoadPdf(boolean mLoadPdf) {
        this.mLoadPdf = mLoadPdf;
    }

    public boolean isMarkerEnabled() {
        return mMarkerEnabled;
    }

    public void setMarkerEnabled(boolean mMarkerEnabled) {
        this.mMarkerEnabled = mMarkerEnabled;
    }

    public boolean isNewFile() {
        return mNewFile;
    }

    public void setNewFile(boolean mNewFile) {
        this.mNewFile = mNewFile;
    }

    public boolean isOpenFile() {
        return mOpenFile;
    }

    public void setOpenFile(boolean mOpenFile) {
        this.mOpenFile = mOpenFile;
    }
}

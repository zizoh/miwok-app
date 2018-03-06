package com.example.android.miwok;

/**
 * Created by Zizoh on 05/02/2018.
 */

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Drawable resource ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Raw audio resource ID the word
     */
    private int mAudioResourceId;

    /**
     * Create a Word object to be used for the Phrases activity.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param audioResourceId is the audio resource ID played for each word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object to be used by the Numbers, Colors and Family Members activity
     *                             that has an additional input parameter image resource ID used by the activities.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     *
     * @param imageResourceId is the image resource ID displayed for each word
     *
     * @param audioResourceId is the audio resource ID played for each word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /** Get the default translation of the word */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /** Get the image resource ID */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an iamge for this word
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the audio resource ID
     */
    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

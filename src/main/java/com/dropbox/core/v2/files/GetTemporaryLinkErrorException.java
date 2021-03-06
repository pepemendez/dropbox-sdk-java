/* DO NOT EDIT */
/* This file was generated from files.stone */

package com.dropbox.core.v2.files;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * GetTemporaryLinkError} error.
 */
public class GetTemporaryLinkErrorException extends DbxApiException {
    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserFilesRequests#getTemporaryLink(String)}.
     */
    public final GetTemporaryLinkError errorValue;

    public GetTemporaryLinkErrorException(String requestId, LocalizedText userMessage, GetTemporaryLinkError errorValue) {
        super(requestId, userMessage, buildMessage("get_temporary_link", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}

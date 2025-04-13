package com.kavindu.feedback;

import jakarta.validation.constraints.*;

public record FeedbackRequest(

        @Positive(message = "200")
        @Min(value = 0,message = "200")
        @Max(value = 5,message = "202")
        Double note,
        @NotNull(message = "203")
        @NotEmpty(message = "203")
        @NotBlank(message = "203")
        String comment,
        @NotNull(message = "204")
        Integer bookId
) {
}

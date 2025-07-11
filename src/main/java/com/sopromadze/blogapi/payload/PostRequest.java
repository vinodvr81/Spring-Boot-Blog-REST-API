package com.sopromadze.blogapi.payload;

import lombok.Data;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PostRequest {

	@NotBlank
	@Size(min = 10)
	private String title;

	@NotBlank
	@Size(min = 50)
	private String body;

	@NotNull
	private Long categoryId;

	private List<String> tags;

	public List<String> getTags() {

		return tags == null ? Collections.emptyList() : new ArrayList<>(tags);
	}

	public void setTags(List<String> tags) {

		if (tags == null) {
			this.tags = null;
		} else {
			this.tags = Collections.unmodifiableList(tags);
		}
	}
}

package com.moyda.www.entity;

import lombok.*;
import lombok.experimental.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Accessors(chain=true)
public class Program {
	private Integer proNo;
	private Integer hostNo;
	private String name;
	private String content;
	private Integer fee;
	private String note;
	private Integer caBNo;
	private Integer caSNo;
	private Boolean enabled;
}

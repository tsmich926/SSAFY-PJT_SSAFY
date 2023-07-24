package com.mmt.domain.response;

import com.mmt.domain.entity.lesson.Lesson;
import com.mmt.domain.entity.lesson.LessonStep;
import com.mmt.domain.request.LessonPostReq;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Arrays;
import java.util.List;

@Data
@NoArgsConstructor
public class LessonLatestRes extends ResponseDto{

    private String lessonTitle;
    private String cookyerId;
    private int categoryId;
    private String description;
    private int maximum;
    private int price;
    private List<String> materials;
    private String videoUrl;
    private String thumbnailUrl;
    private List<LessonStep> lessonStepList;

    public LessonLatestRes(Lesson lesson){
        this.lessonTitle = lesson.getLessonTitle();
        this.cookyerId = lesson.getCookyerId();
        this.categoryId = lesson.getLessonCategory().getCategoryId();
        this.description = lesson.getDescription();
        this.maximum = lesson.getMaximum();
        this.price = lesson.getPrice();
        this.materials = Arrays.asList(lesson.getMaterials().split(","));
        this.videoUrl = lesson.getVideoUrl();
        this.thumbnailUrl = lesson.getThumbnailUrl();
        this.lessonStepList = lesson.getLessonStepList();
    }
}

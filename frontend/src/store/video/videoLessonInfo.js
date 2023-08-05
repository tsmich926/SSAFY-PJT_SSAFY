// lessonSlice.js
import { createSlice } from "@reduxjs/toolkit";

const initialState = {
  lessonTitle: undefined,
  cookyerName: undefined,
  lessonStepList: undefined,
  totalSteps: 0,
  curStep: undefined,
  curIdx: undefined,
};

const videoLessonInfo = createSlice({
  name: "videoLessonInfo",
  initialState,
  reducers: {
    setLessonInfo: (state, {payload}) => {
      state.lessonTitle = payload.lessonTitle
      state.cookyerName = payload.cookyerName
      state.lessonStepList = payload.lessonStepList
      state.totalSteps = payload.lessonStepList.length
    },
    setLessonStepList: (state, {payload}) => {
      console.log("진행단계 변경", payload)
      state.lessonStepList = payload
    },
    setCurStep: (state, { payload }) => {
      state.curStep = payload
    },
    setCurIdx: (state, {payload}) => {
      state.curIdx = payload
    },
    setStepInfo: (state, { payload }) => {
      console.log("요리단계 시그널 받아 저장")
      state.curStep = payload.curStep
      state.curIdx = payload.curIdx
    },
  },
});

export const { 
  setLessonInfo, setLessonStepList, setCurStep, setCurIdx, setStepInfo
} = videoLessonInfo.actions;
export default videoLessonInfo.reducer;
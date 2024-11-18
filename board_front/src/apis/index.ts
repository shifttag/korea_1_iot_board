import axios from "axios";
import { Task } from "../types";

export const MAIN_URL = `http://localhost:4041/api/v1`;
const TASK_API_URL = `${MAIN_URL}/todos`;

export const createTask = async (task: string) => {
  console.log(`POST ${TASK_API_URL}`, { task, status: false });
  const response = await axios.post<{data: Task}>(TASK_API_URL, { task, status: false });
  console.log(response.data);
  return response.data.data;
};

export const fetchTasks = async () => {
  console.log(`GET ${TASK_API_URL}`);
  const response = await axios.get<{data: Task[]}>(TASK_API_URL);
  console.log(response.data);
  return response.data.data;
};

export const updateTaskStatus = async (id: number, status: boolean) => {
  console.log(`PUT ${TASK_API_URL}/${id}`, { status });
  await axios.put(`${TASK_API_URL}/${id}`, { status });
};

export const deleteTask = async (id: number) => {
  console.log(`DELETE ${TASK_API_URL}/${id}`);
  await axios.delete(`${TASK_API_URL}/${id}`);
};

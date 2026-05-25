import axios from "axios";

const API = axios.create({
  baseURL: "http://68.183.107.3:8080/api",
});
delete API.defaults.headers.common["Authorization"];
export default API;

use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};
use std::num;

fn main() {
  let stdin = io::stdin();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let x = line.parse::<f64>().unwrap();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let y = line.parse::<f64>().unwrap();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let l = line.parse::<f64>().unwrap();

  let xdl = (x.abs()/l).ceil() as i32;
  let ydl = (y.abs()/l).ceil() as i32;
  
  let mut res:i32 = 0;
  if y < 0.0  {
    res += 2;
  } else if x != 0.0 {
    res += 1;
  }
  res += xdl;
  res += ydl;
  println!("{}", res);
}
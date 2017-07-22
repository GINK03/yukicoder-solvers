use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main(){
  let stdin = io::stdin();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let n = line.parse::<i32>().unwrap();

  let mut ok:i32 = 0;
  let mut ng:i32 = 0; 
  for i in 0..n {
    let line      = stdin.lock().lines().next().unwrap().unwrap();
    let mut iter  = line.split_whitespace();
    let time      = iter.next().unwrap().parse::<i32>().unwrap();
    let string    = iter.next().unwrap();
    let len       = string.len() as i32;
    let types     = 12*time/1000;
    if types >= len {
      ok += len;
    } else {
      ok += types;
      ng += len - types;
    }
  }

  println!("{} {}", ok, ng);
}
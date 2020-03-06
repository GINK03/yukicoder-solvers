use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin  = io::stdin();
  let line   = stdin.lock().lines().next().unwrap().unwrap();
  let m      = line.parse::<i32>().unwrap();
  let ac     = (1..m+1).fold(0, |acc, x| acc + x);
  println!("{}", ac);
}
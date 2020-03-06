use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

fn main() {
  let stdin = io::stdin();
  let line = stdin.lock().lines().next().unwrap().unwrap();
  let m = line.parse::<i32>().unwrap();
  let mut map = HashMap::new(); 
  for i in (1..m/2+1) { 
    for j in (1..m/2+1-i) {
      if i + j <= m/2 { 
        map.entry(i*j).or_insert(i+j);
      }
    }
  }
  let mut max:i32 = 0;
  for (k,v) in map.iter() {
    if max < *k { 
      max = *k;
    }
  }
  println!("{}", max)
}
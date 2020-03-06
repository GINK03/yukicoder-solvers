use std::io::{self, BufRead};
use std::collections::{HashMap, LinkedList};

#[derive(Clone)]
struct P { 
  cnt:i32,
  buf:i32,
}
impl Copy for P{ }
fn main() {
  let stdin = io::stdin();
  let line  = stdin.lock().lines().next().unwrap().unwrap();
  let max   = line.parse::<i32>().unwrap();
  
  let mut m:HashMap<i32, i32> = HashMap::new();
  for i in (1..max+1) {
    let bin    = format!("{:b}", i);
    let onenum = bin.chars().filter(|&i| i == '1').count() as i32;
    m.insert(i, onenum);
  }

  let mut buf:i32 = 1;
  let mut cnt:i32 = 1;

  let p = P { cnt:1, buf:1 }; 
  let mut que:HashMap<i32, P> = HashMap::new();
  que.insert(1, p);
  let mut prevlen = 0;
  let mut cnt = 0;
  while true {
    let mut ps:Vec<P> = Vec::new();
    let mut _maxcnt:i32 = 1;
    let mut _maxbuf:i32 = 1;
    for (key, val) in que.iter() {
      if _maxcnt < val.cnt {
        _maxcnt = val.cnt;
      }
      if _maxbuf < val.buf {
        _maxbuf = val.buf;
      }
    }
    for (key, val) in que.iter() {
      if val.cnt == _maxcnt {
        ps.push(*val);
      }
    }
    if ps.len() == 0 {
      break;
    }
    if _maxbuf == max {
      cnt = _maxcnt;
      break;
     } 
    prevlen = que.len();
    for p in ps {
      let buff = p.buf;
      if m.contains_key( &(p.buf - m[&buff]) ) { 
        let pprev = P { cnt: p.cnt+1, buf: p.buf - m[&buff] };
        if ! que.contains_key( &(p.buf - m[&buff]) ) {
          que.insert(p.buf - m[&buff], pprev);
        }
      }
      if m.contains_key( &(p.buf + m[&buff]) ) { 
        let pnext = P { cnt: p.cnt+1, buf: p.buf + m[&buff] };
        if ! que.contains_key( &(p.buf + m[&buff]) ) {
          que.insert(p.buf + m[&buff], pnext);
        }
      }
    }
    if prevlen == que.len() {
      cnt = -1;
      break;
    }

  }
  println!("{}", cnt);
}
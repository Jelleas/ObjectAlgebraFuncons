let r = ref `A` ;;
(* r : char ref = ref `A` *)

let v = make_vect 3 r ;;
(* v : char ref vect = [|ref `A`; ref `A`; ref `A`|] *)

vect_length v ;;
(* - : int = 3 *)

!(v.(0)) ;;
(* - : char = `A` *)

r := `B` ; !(v.(0)) ;;
(* - : char = `B` *)

let r2 = v.(1) ;;
(* r2 : char ref = ref `B` *)

r2 := `C` ; !(v.(0)) ;;
(* - : char = `C` *)

let r3 = ref `D` ;;
(* r3 : char ref = ref `D` *)

v.(2) <- r3 ; !(v.(0)) ;;
(* - : char = `C` *)

!(v.(2)) ;;
(* - : char = `D` *)

export class JwtResponse {
  id: number;
  accessToken: string;
  type: string;
  username: string;
  password: string;
  name: string;
  email: string;
  admin: boolean;
  authorities: string[];
}

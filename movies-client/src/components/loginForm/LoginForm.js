import { Form, Button, Row, Col } from 'react-bootstrap';

const LoginForm = ({
    handleLogin,
    handleSignup,
    revText_usrname,
    labelText_usrname,
    revText_password,
    labelText_password,
    revText_emailId,
    labelText_emailId,
    defaultValue}) => {

    const buttonStyle = {
        width: '25%', // Customize the width as needed (e.g., '200px')
        
    };

    return (
        <Form>
            <Form.Group className="mb-3" controlId="formEmailId">
                <Form.Label>{labelText_emailId}</Form.Label>
                <Form.Control 
                    ref={revText_emailId} as="textarea" 
                    rows={1} 
                    type="emailId" 
                    placeholder="Enter your emailId"
                    defaultValue={defaultValue} 
                />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formUsername">
                <Form.Label>{labelText_usrname}</Form.Label>
                <Form.Control 
                    ref={revText_usrname} as="textarea" 
                    rows={1} 
                    type="user name" 
                    placeholder="Enter your username"
                    defaultValue={defaultValue} 
                />
            </Form.Group>

            <Form.Group className="mb-3" controlId="formPassword">
                <Form.Label>{labelText_password}</Form.Label>
                <Form.Control ref={revText_password} as="textarea"  
                    rows={1}
                    type="password"
                    placeholder="Enter your password" 
                    defaultValue={defaultValue} 
                />
            </Form.Group>

            <Row>
                <Col className="d-flex justify-content-center">
                <Button variant="outline-info" size="sm" style={buttonStyle}onClick={handleLogin}>LogIn</Button>
                </Col>
            </Row>
            <Row>
                <Col className="d-flex justify-content-center">
                <Button variant="outline-info" size="sm" style={buttonStyle} onClick={handleSignup}>SignUp</Button>
                </Col>
                
            </Row>
        </Form>   
    )
}

export default LoginForm  